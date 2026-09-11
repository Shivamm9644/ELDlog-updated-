import re
path = r'C:\Users\inurum_five\Downloads\angular\src\app\form\log-driver\log-driver.component.html'
with open(path, 'r', encoding='utf-8') as f:
    content = f.read()

replacement = """<td>
    <span *ngIf="graphStatus.isInactive === 0" class="badge badge-success">Active Log</span>
    <span *ngIf="graphStatus.isInactive === 1" class="badge badge-danger">Inactive</span>
    <span *ngIf="graphStatus.isInactive === 2" class="badge badge-info">Active Edited</span>
    <span *ngIf="graphStatus.isInactive == null" class="badge badge-primary">{{graphStatus.employeeStatus}}</span>
</td>"""

# Handle potential whitespace differences around the tag
new_content = re.sub(r'<td>\{\{graphStatus\.employeeStatus\}\}</td>', replacement, content)

with open(path, 'w', encoding='utf-8') as f:
    f.write(new_content)

print('Replacement finished.')
